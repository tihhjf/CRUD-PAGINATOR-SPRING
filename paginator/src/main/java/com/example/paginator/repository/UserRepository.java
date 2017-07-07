package com.example.paginator.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.paginator.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long>{

}
