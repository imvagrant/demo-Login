package com.song.mapper;
import com.song.pojo.Recipe;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface RecipeMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from recipe")
    List<Recipe> selectAll();

    /**
     * 查询菜系
     * @param regionalCuisines
     * @return
     */
    @Select("select * from recipe where regionalCuisines like concat('%',#{regionalCuisines,jdbcType=VARCHAR},'%')")
    List<Recipe> selectRegionalCuisines(@Param("regionalCuisines") String regionalCuisines);

    /**
     *添加数据
     * @param recipe
     */
    @Insert("insert into recipe values (null,#{recipeName},#{regionalCuisines},#{materials},#{step},null,#{images})")
    void add(Recipe recipe);
}
