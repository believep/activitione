package believep.mapper;

import believep.pojo.Leavee;

import java.util.List;

public interface LeaveeMapper {
    /**
     * 发起请假,将请假信息存入数据库中
     */
    public int addLeavee(Leavee leavee);
    /**
     * 查询待审批的假条列表
     *参数List表示待审批假条ID的集合
     */
    public List<Leavee> getApproveLeaveeList(List<String> list);
    /**
     *更改假条状态
     */
    public int updateLeavee(int lid,int status);
}
