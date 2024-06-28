package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShiwubaojingEntity;
import com.entity.view.ShiwubaojingView;

import com.service.ShiwubaojingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 事务报警
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
@RestController
@RequestMapping("/shiwubaojing")
public class ShiwubaojingController {
    @Autowired
    private ShiwubaojingService shiwubaojingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiwubaojingEntity shiwubaojing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			shiwubaojing.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiwubaojingEntity> ew = new EntityWrapper<ShiwubaojingEntity>();
		PageUtils page = shiwubaojingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiwubaojing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiwubaojingEntity shiwubaojing, 
		HttpServletRequest request){
        EntityWrapper<ShiwubaojingEntity> ew = new EntityWrapper<ShiwubaojingEntity>();
		PageUtils page = shiwubaojingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiwubaojing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiwubaojingEntity shiwubaojing){
       	EntityWrapper<ShiwubaojingEntity> ew = new EntityWrapper<ShiwubaojingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiwubaojing, "shiwubaojing")); 
        return R.ok().put("data", shiwubaojingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiwubaojingEntity shiwubaojing){
        EntityWrapper< ShiwubaojingEntity> ew = new EntityWrapper< ShiwubaojingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiwubaojing, "shiwubaojing")); 
		ShiwubaojingView shiwubaojingView =  shiwubaojingService.selectView(ew);
		return R.ok("查询事务报警成功").put("data", shiwubaojingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiwubaojingEntity shiwubaojing = shiwubaojingService.selectById(id);
        return R.ok().put("data", shiwubaojing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiwubaojingEntity shiwubaojing = shiwubaojingService.selectById(id);
        return R.ok().put("data", shiwubaojing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiwubaojingEntity shiwubaojing, HttpServletRequest request){
    	shiwubaojing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiwubaojing);
        shiwubaojingService.insert(shiwubaojing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiwubaojingEntity shiwubaojing, HttpServletRequest request){
    	shiwubaojing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiwubaojing);
        shiwubaojingService.insert(shiwubaojing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShiwubaojingEntity shiwubaojing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiwubaojing);
        shiwubaojingService.updateById(shiwubaojing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiwubaojingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShiwubaojingEntity> wrapper = new EntityWrapper<ShiwubaojingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shiwubaojingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
