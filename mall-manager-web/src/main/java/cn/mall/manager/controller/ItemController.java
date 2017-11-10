package cn.mall.manager.controller;

import cn.mall.manager.service.ItemService;
import cn.mall.pojo.TbItem;
import cn.mall.utils.PageBeanResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ItemController {
	
	//注入service服务对象
	@Autowired
	private ItemService itemService;

	
	/**
	 * 需求:根据id查询商品数据
	 * 请求:item/findItem/635906
	 * 参数: Long itemId
	 * 返回值:json格式TbItem
	 */
	@RequestMapping("item/findItem/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		//调用service服务方法
		TbItem item = itemService.findItemById(itemId);
		return item;
	}

	@RequestMapping("item/list")
	@ResponseBody
	public PageBeanResult findItemByPage(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "20") Integer rows){
		PageBeanResult itemByPage = itemService.findItemByPage( page, rows );
		return itemByPage;

	}
}
