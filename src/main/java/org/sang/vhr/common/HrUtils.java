package org.sang.vhr.common;

import org.sang.vhr.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

public class HrUtils {
    /*获取当前用户信息*/
    public static Hr getCurrentHr()
    {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
