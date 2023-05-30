package com.taufiq.di

import com.taufiq.repo.HeroRepository
import com.taufiq.repo.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {

    single<HeroRepository> { HeroRepositoryImpl() }

}