package net.kokwind.springboot.mapper;

import net.kokwind.springboot.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {
    @Select("select * from person where id = #{id}")
    Person getPersonById(Integer id);
}
