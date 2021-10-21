package com.javaGG.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint jointpoint) throws Throwable {
		
		String signatureStr = jointpoint.getSignature().toShortString();
		System.out.println(signatureStr + "메서드가 시작 되었습니다!");
		long st = System.currentTimeMillis();
				
		try {
			Object obj = jointpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "메서드가 종료 되었습니다!");
			System.out.println(signatureStr + "경과시간 : " + (et-st));
		}
	}
}