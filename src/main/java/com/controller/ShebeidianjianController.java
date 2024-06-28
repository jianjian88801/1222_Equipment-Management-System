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

import com.entity.ShebeidianjianEntity;
import com.entity.view.ShebeidianjianView;

import com.service.ShebeidianjianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 设备点检
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
@RestController
@RequestMapping("/shebeidianjian")
public class ShebeidianjianController {
    @Autowired
    private ShebeidianjianService shebeidianjianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeidianjianEntity shebeidianjian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			shebeidianjian.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShebeidianjianEntity> ew = new EntityWrapper<ShebeidianjianEntity>();
		PageUtils page = shebeidianjianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeidianjian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShebeidianjianEntity shebeidianjian, 
		HttpServletRequest request){
        EntityWrapper<ShebeidianjianEntity> ew = new EntityWrapper<ShebeidianjianEntity>();
		PageUtils page = shebeidianjianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeidianjian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeidianjianEntity shebeidianjian){
       	EntityWrapper<ShebeidianjianEntity> ew = new EntityWrapper<ShebeidianjianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeidianjian, "shebeidianjian")); 
        return R.ok().put("data", shebeidianjianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeidianjianEntity shebeidianjian){
        EntityWrapper< ShebeidianjianEntity> ew = new EntityWrapper< ShebeidianjianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeidianjian, "shebeidianjian")); 
		ShebeidianjianView shebeidianjianView =  shebeidianjianService.selectView(ew);
		return R.ok("查询设备点检成功").put("data", shebeidianjianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeidianjianEntity shebeidianjian = shebeidianjianService.selectById(id);
        return R.ok().put("data", shebeidianjian);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeidianjianEntity shebeidianjian = shebeidianjianService.selectById(id);
        return R.ok().put("data", shebeidianjian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShebeidianjianEntity shebeidianjian, HttpServletRequest request){
    	shebeidianjian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shebeidianjian);
        shebeidianjianService.insert(shebeidianjian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShebeidianjianEntity shebeidianjian, HttpServletRequest request){
    	shebeidianjian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shebeidianjian);
        shebeidianjianService.insert(shebeidianjian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShebeidianjianEntity shebeidianjian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeidianjian);
        shebeidianjianService.updateById(shebeidianjian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shebeidianjianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShebeidianjianEntity> wrapper = new EntityWrapper<ShebeidianjianEntity>();
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

		int count = shebeidianjianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
