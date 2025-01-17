package com.market.kintu.backend.domain.model.port;

import com.market.kintu.backend.domain.model.User;

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}
