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

import com.entity.ShebeibaoxiuEntity;
import com.entity.view.ShebeibaoxiuView;

import com.service.ShebeibaoxiuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 设备报修
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
@RestController
@RequestMapping("/shebeibaoxiu")
public class ShebeibaoxiuController {
    @Autowired
    private ShebeibaoxiuService shebeibaoxiuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeibaoxiuEntity shebeibaoxiu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shebeibaoxiu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShebeibaoxiuEntity> ew = new EntityWrapper<ShebeibaoxiuEntity>();
		PageUtils page = shebeibaoxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeibaoxiu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShebeibaoxiuEntity shebeibaoxiu, 
		HttpServletRequest request){
        EntityWrapper<ShebeibaoxiuEntity> ew = new EntityWrapper<ShebeibaoxiuEntity>();
		PageUtils page = shebeibaoxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeibaoxiu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeibaoxiuEntity shebeibaoxiu){
       	EntityWrapper<ShebeibaoxiuEntity> ew = new EntityWrapper<ShebeibaoxiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeibaoxiu, "shebeibaoxiu")); 
        return R.ok().put("data", shebeibaoxiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeibaoxiuEntity shebeibaoxiu){
        EntityWrapper< ShebeibaoxiuEntity> ew = new EntityWrapper< ShebeibaoxiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeibaoxiu, "shebeibaoxiu")); 
		ShebeibaoxiuView shebeibaoxiuView =  shebeibaoxiuService.selectView(ew);
		return R.ok("查询设备报修成功").put("data", shebeibaoxiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeibaoxiuEntity shebeibaoxiu = shebeibaoxiuService.selectById(id);
        return R.ok().put("data", shebeibaoxiu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeibaoxiuEntity shebeibaoxiu = shebeibaoxiuService.selectById(id);
        return R.ok().put("data", shebeibaoxiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShebeibaoxiuEntity shebeibaoxiu, HttpServletRequest request){
    	shebeibaoxiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shebeibaoxiu);
        shebeibaoxiuService.insert(shebeibaoxiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShebeibaoxiuEntity shebeibaoxiu, HttpServletRequest request){
    	shebeibaoxiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shebeibaoxiu);
        shebeibaoxiuService.insert(shebeibaoxiu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShebeibaoxiuEntity shebeibaoxiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeibaoxiu);
        shebeibaoxiuService.updateById(shebeibaoxiu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shebeibaoxiuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShebeibaoxiuEntity> wrapper = new EntityWrapper<ShebeibaoxiuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shebeibaoxiuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
