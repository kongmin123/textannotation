package com.annotation.dao;

import com.annotation.model.Document;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface DocumentMapper {
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table file
//     *
//     * @mbg.generated
//     */
//    int deleteByPrimaryKey(Integer id);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table file
//     *
//     * @mbg.generated
//     */



//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table file
//     *
//     * @mbg.generated
//     */
//    File selectByPrimaryKey(Integer id);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table file
//     *
//     * @mbg.generated
//     */
//    List<File> selectAll();
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table file
//     *
//     * @mbg.generated
//     */
//    int updateByPrimaryKey(File record);

       /**
        * 插入文件
        * @param document
        * @return
        */
       int insertDocument(Document document);//将文件存进数据库

       /**
        * 分页查询
        * 参数：用户ID,页数，每页数量
        * @param data
        * @return
        */
       List<Document> selectDocumentByRelatedInfo(Map<String,Object> data);

       /**
        * 根据用户ID获取记录总数
        * @param userid
        * @return
        */
       Integer countDocNumByUserId(int userid);



}