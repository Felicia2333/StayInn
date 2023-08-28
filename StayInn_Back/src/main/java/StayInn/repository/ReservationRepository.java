package StayInn.repository;


import StayInn.model.Stay;
import StayInn.model.Reservation;
import StayInn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {


    List<Reservation> findByGuest(User guest);


    List<Reservation> findByStay(Stay stay);


    Reservation findByIdAndGuest(Long id, User guest);


    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);


}
