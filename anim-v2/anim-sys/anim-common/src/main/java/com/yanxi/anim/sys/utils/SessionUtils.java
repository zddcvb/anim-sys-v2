package com.yanxi.anim.sys.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {
	public static HttpSession getSession(HttpServletRequest request) {
		return request.getSession();
	}

	public static void addSession(HttpServletRequest request, String sessionKey, String sessionValue) {
		addSession(request, sessionKey, sessionValue, 0);
	}

	public static void addSession(HttpServletRequest request, String sessionKey, String sessionValue, int seconds) {
		HttpSession session = request.getSession();
		session.setAttribute(sessionKey, sessionValue);
		session.setMaxInactiveInterval(seconds);
	}

	public static String getSessionValue(HttpServletRequest request, String sessionKey) {
		HttpSession session = request.getSession();
		String value = (String) session.getAttribute(sessionKey);
		return value;
	}

	public static void deleteSession(HttpServletRequest request, String sessionKey) {
		HttpSession session = request.getSession();
		session.removeAttribute(sessionKey);
	}
}
