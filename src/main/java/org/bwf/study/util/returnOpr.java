package org.bwf.study.util;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class returnOpr {
    //切点
    @Pointcut("execution(public * org.bwf.study.controller.*.*(..))")
    public void webReturn(){}

    // 拦截点，就是什么时候进行拦截，需要指定拦截的切点，还需要指定返回值的占位符
    @AfterReturning(pointcut = "webReturn()", returning = "rvt")
    public void doAfterReturnning(returnInfo rvt){
//        System.out.println(rvt.getCode());
        System.out.println("DoAfter-AOP.......");
        if(rvt.getData() == null ){
            rvt.setMsg("操作失败");
            rvt.setCode(400);
        }else{
            rvt.setMsg("操作成功");
            rvt.setCode(200);
        }
    }
}
