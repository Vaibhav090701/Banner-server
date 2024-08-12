package com.example.banner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banner.modal.Banner;
import com.example.banner.repository.BannerRepository;

@RestController
@RequestMapping("/api/banner")
@CrossOrigin(origins = "http://localhost:5175") // Allow your frontend origin4
public class BannerController {

	@Autowired
    private BannerRepository bannerRepository;

    @GetMapping
    public ResponseEntity<Banner> getBanner() {
        Banner banner = bannerRepository.findById(1L).orElse(new Banner());
        return ResponseEntity.ok(banner);
    }

    @PostMapping
    public ResponseEntity<Banner> updateBanner(@RequestBody Banner banner) {
        Banner updatedBanner = bannerRepository.save(banner);
        return ResponseEntity.ok(updatedBanner);
    }
}

