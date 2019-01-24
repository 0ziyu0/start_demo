package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.UserEntity;

public interface IUserDao extends JpaRepository<UserEntity, Long> {

}
