package com.dxc.openShopReport.configurer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.dxc.openShopReport.dao.TLoggerInfosMapper;
import com.dxc.openShopReport.model.TLoggerInfos;
import com.dxc.openShopReport.util.LoggerUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class LoggerInterceptor implements HandlerInterceptor {
    private static final String LOGGER_SEND_TIME = "_send_time";
    private static final String LOGGER_ENTITY = "_logger_entity";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        TLoggerInfos logger = new TLoggerInfos();
        String sessionId = request.getRequestedSessionId();
        String url = request.getRequestURI();
        String paramData = JSON.toJSONString(request.getParameterMap(),SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteMapNullValue);
        logger.setAliClientIp(WebMvcConfigurer.getIpAddress(request));
        logger.setAliMethod(request.getMethod());
        logger.setAliType("普通参数");
        logger.setAliParamData(paramData);
        logger.setAliUri(url);
        logger.setAliSessionId(sessionId);
        logger.setAliId(1);
        request.setAttribute(LOGGER_SEND_TIME,System.currentTimeMillis());
        request.setAttribute(LOGGER_ENTITY,logger);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        int status = response.getStatus();
        long currentTime = System.currentTimeMillis();
        long time = Long.valueOf(request.getAttribute(LOGGER_SEND_TIME).toString());
        TLoggerInfos logger = (TLoggerInfos)request.getAttribute(LOGGER_ENTITY);
        logger.setAliTimeConsuming(Integer.valueOf((currentTime - time) + ""));
        logger.setAliReturnTime(currentTime+"");
        logger.setAliHttpStatusCode(status+"");
        logger.setAliTime(new Date());
        logger.setAliReturnData(JSON.toJSONString(request.getAttribute(LoggerUtils.LOGGER_RETURN),
                SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteMapNullValue));
        TLoggerInfosMapper mapper = getData(TLoggerInfosMapper.class,request);
        mapper.insertLogInfo(logger);
    }

    public static <T> T getData(Class<T> clazz,HttpServletRequest request){
        ApplicationContext ac1 = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        return ac1.getBean(clazz);
    }
}
