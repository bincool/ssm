/**
 * Filename: IndexController.java
 * Package: io.github.bincool.controller.system.index
 * Copyright: Wchy-bingV All Rights Reserved.QQ:891946049.
 * Description: IndexController.java
 * Author: wchy.
 * Date: 2017/12/14 22:28.
 * Content: 新增.
 * Version: V1.0.
 */
package io.github.bincool.controller.system.index;

import io.github.bincool.controller.base.impl.BaseController;
import io.github.bincool.entity.test.test.Test;
import io.github.bincool.service.test.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description: 系统首页.
 * </p>
 * <p>
 * 详细描述.
 * </p>
 * Author: wchy.
 * Since: 2017/12/4.22:28.
 */
@Controller
public class IndexController extends BaseController
{

    @Resource
    private TestService testService;

    /**
     * 用户认证-登录后台首页.
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/index")
    public ModelAndView index()
    {
        ModelAndView mv = this.getModelAndView();
        List<Test> testList = new ArrayList<Test>();
        try
        {
            testList = testService.listAll(new Test());
            LOGGER.info(testList);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        mv.addObject("testList", testList);
        mv.setViewName("views/welcome");
        return mv;
    }

}
