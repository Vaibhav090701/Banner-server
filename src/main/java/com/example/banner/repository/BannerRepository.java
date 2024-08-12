package com.example.banner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banner.modal.Banner;

public interface BannerRepository extends JpaRepository<Banner, Long> {

}
