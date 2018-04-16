package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.Country;

import java.util.List;

/**
 * @Author: Chenjh
 * @Discription:
 * @Date: Create in 8:45 2018/4/16
 * @Modified By:
 */
public interface CountryMapper {

    List<Country> selectAll();

}
