package com.x.calendar.assemble.control.jaxrs;

import javax.servlet.annotation.WebFilter;

import com.x.base.core.project.jaxrs.ManagerUserJaxrsFilter;

/**
 * web服务过滤器，将指定的URL定义为需要用户认证的服务，如果用户未登录，则无法访问该服务
 * 
 * @author O2LEE *
 */
@WebFilter(urlPatterns = {
	"/jaxrs/calendar/*",
	"/jaxrs/setting/*",
	"/jaxrs/event/*"
}, asyncSupported = true )
public class CalendarJaxrsFilter extends ManagerUserJaxrsFilter {

}