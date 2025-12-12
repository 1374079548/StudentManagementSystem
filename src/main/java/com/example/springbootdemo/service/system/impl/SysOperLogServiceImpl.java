package com.example.springbootdemo.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootdemo.mapper.system.SysOperLogMapper;
import com.example.springbootdemo.model.system.SysOperLog;
import com.example.springbootdemo.service.system.ISysOperLogService;
import org.springframework.stereotype.Service;

@Service
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog> implements ISysOperLogService {
}
