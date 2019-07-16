package edu.services.support;

import framework.mybatis.AutoMapper;
import framework.service.impl.SuperServiceImpl;

public class BaseServiceImpl<M extends AutoMapper<T>, T> extends SuperServiceImpl<M, T> {

}
