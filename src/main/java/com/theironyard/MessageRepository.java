package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by lindseyringwald on 9/22/16.
 */
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
