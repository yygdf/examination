package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.SurgeryInfo;

import java.util.List;

public interface SurgeryInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SurgeryInfo record);

    int insertSelective(SurgeryInfo record);

    SurgeryInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SurgeryInfo record);

    int updateByPrimaryKey(SurgeryInfo record);

    List<SurgeryInfo> selectSurgeryInfoByName(String name);

    SurgeryInfo selectSurgeryInfoByNo(Integer no);
}