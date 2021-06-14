package com.example.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Track;

@Repository
public interface TrackRepo extends JpaRepository<Track, Long>
{

}
