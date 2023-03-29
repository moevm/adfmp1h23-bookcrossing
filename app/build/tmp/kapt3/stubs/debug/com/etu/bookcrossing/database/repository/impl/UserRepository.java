package com.etu.bookcrossing.database.repository.impl;

import com.etu.bookcrossing.database.dao.UserDao;
import com.etu.bookcrossing.database.entity.UserEntity;
import com.etu.bookcrossing.database.repository.IUserRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/etu/bookcrossing/database/repository/impl/UserRepository;", "Lcom/etu/bookcrossing/database/repository/IUserRepository;", "userDao", "Lcom/etu/bookcrossing/database/dao/UserDao;", "(Lcom/etu/bookcrossing/database/dao/UserDao;)V", "insert", "", "users", "", "Lcom/etu/bookcrossing/database/entity/UserEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rating", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class UserRepository implements com.etu.bookcrossing.database.repository.IUserRepository {
    private final com.etu.bookcrossing.database.dao.UserDao userDao = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.database.dao.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.etu.bookcrossing.database.entity.UserEntity>> rating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.etu.bookcrossing.database.entity.UserEntity> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}