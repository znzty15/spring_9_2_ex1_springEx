package com.javaGG.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint jointpoint) throws Throwable {
		
		String signatureStr = jointpoint.getSignature().toShortString();
		System.out.println(signatureStr + "�޼��尡 ���� �Ǿ����ϴ�!");
		long st = System.currentTimeMillis();
				
		try {
			Object obj = jointpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "�޼��尡 ���� �Ǿ����ϴ�!");
			System.out.println(signatureStr + "����ð� : " + (et-st));
		}
	}
}