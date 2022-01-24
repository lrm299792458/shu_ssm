package cn.shu.service;

import cn.shu.domain.Admin;

import java.util.List;

public interface IAdminService {

    public List<Admin> findAll();

    public void saveAdmin(Admin admin);
}
