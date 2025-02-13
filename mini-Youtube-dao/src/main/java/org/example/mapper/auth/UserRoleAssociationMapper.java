package org.example.mapper.auth;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.entity.auth.UserRoleAssociation;

import java.util.List;

@Mapper
public interface UserRoleAssociationMapper {

    @Select("SELECT * FROM t_user_role_association WHERE userId = #{userId}")
    List<UserRoleAssociation> getUserRoleAssociationByUserId(Long userId);

    @Insert("INSERT INTO t_user_role_association(userId, roleId, createdTime) VALUES" +
            "(#{userId}, #{roleId}, #{createdTime})")
    void addUserRole(UserRoleAssociation userRole);

    @Select("SELECT code " +
            "FROM t_user_role_association AS ua LEFT JOIN t_auth_role AS ar " +
            "ON ua.roleId = ar.id " +
            "WHERE userId = #{userId}")
    List<String> getRoleCodeListByUserId(Long userId);
}
