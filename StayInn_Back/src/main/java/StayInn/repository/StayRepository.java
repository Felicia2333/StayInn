package StayInn.repository;


import StayInn.model.Stay;
import StayInn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface StayRepository extends JpaRepository<Stay, Long> {


    List<Stay> findByHost(User user);


    Stay findByIdAndHost(Long id, User host);


    List<Stay> findByIdInAndGuestNumberGreaterThanEqual(List<Long> ids, int guestNumber);


}

