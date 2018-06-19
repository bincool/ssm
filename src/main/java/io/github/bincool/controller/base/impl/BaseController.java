/**
 * Filename: BaseController.java
 * Package: io.github.bincool.controller.base.impl
 * Copyright: Wchy-bingV All Rights Reserved.QQ:891946049.
 * Description: BaseController.java
 * Author: wchy.
 * Date: 2017/12/4 22:30.
 * Content: 新增.
 * Version: V1.0.
 */
package io.github.bincool.controller.base.impl;

import io.github.bincool.controller.base.IBaseController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * Description: 控制层基类.
 * </p>
 * <p>
 * 详细描述.
 * </p>
 * Author: wchy.
 * Since: 2017/12/4.22:30.
 */
public class  BaseController implements IBaseController
{

    /**
     * 日志对象.
     */
    protected Log LOGGER = LogFactory.getLog(this.getClass());

    /**
     * UID.
     */
    private static final long serialVersionUID = 6357869213649815390L;

    /**
     * 得到ModelAndView.
     * @return
     */
    public ModelAndView getModelAndView()
    {
        return new ModelAndView();
    }

    /**
     * 得到request对象
     * @return
     */
    public HttpServletRequest getRequest()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    /**
     *
     * @param logger
     * @param interfaceName
     */
    public void logBefore(Log logger, String interfaceName)
    {
        logger.info("");
        logger.info("start");
        logger.info(interfaceName);
    }

    /**
     *
     * @param logger
     */
    public void logAfter(Log logger)
    {
        logger.info("end");
        logger.info("");
    }

}
