package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.vhr.bean.Hr;
import org.sang.vhr.bean.MsgContent;
import org.sang.vhr.bean.SysMsg;

import java.util.List;
@Mapper
public interface SysMsgMapper {
    int sendMsg(MsgContent msg);
    int addMsg2AllHr(@Param("hrs") List<Hr> hrs, @Param("mid") Long mid);
    List<SysMsg> getSysMsg(@Param("start") int start, @Param("size") Integer size, @Param("hrid") Long hrid);
    int markRead(@Param("flag") Long flag, @Param("hrid") Long hrid);
}
