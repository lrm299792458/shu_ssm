package cn.shu.service.impl;

import cn.shu.dao.IAdminDao;
import cn.shu.domain.Admin;
import cn.shu.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    IAdminDao adminDao;
    @Override
    public List<Admin> findAll() {


        return adminDao.findAll();
    }

    @Override
    public void saveAdmin(Admin admin) {
        adminDao.saveAdmin(admin);
    }
}
