package com.example.reto4.Repository.CRUD;

import com.example.reto4.Model.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
