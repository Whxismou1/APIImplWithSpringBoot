package com.whximou.Basic.API.Impl.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.whximou.Basic.API.Impl.Models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
