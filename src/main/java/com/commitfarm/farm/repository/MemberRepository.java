package com.commitfarm.farm.repository;

import com.commitfarm.farm.domain.Member;
import com.commitfarm.farm.domain.Project;
import com.commitfarm.farm.domain.enumClass.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findAllByProject(Project project);
    List<Member> findAllByProjectAndUserType(Project project, UserType userType);
    Optional<Member> findByProject_ProjectIdAndUser_UserId(Long projectId, Long userId);
    //used to get ticket list api, update status api
}
