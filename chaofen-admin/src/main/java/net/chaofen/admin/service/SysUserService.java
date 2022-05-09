package net.chaofen.admin.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import net.chaofen.admin.model.SysUser;
import net.chaofen.admin.model.SysUserRole;
import net.chaofen.core.page.PageRequest;
import net.chaofen.core.service.CurdService;

/**
 * 用户管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysUserService extends CurdService<SysUser> {

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userName
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

	/**
	 * 生成用户信息Excel文件
	 * @param pageRequest 要导出的分页查询参数
	 * @return
	 */
	File createUserExcelFile(PageRequest pageRequest);

}
