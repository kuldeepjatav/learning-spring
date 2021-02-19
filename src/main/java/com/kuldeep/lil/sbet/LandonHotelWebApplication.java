package com.kuldeep.lil.sbet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LandonHotelWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LandonHotelWebApplication.class, args);
    }
	/*
	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		@Autowired
		private RoomRepository roomRepository;

		@GetMapping
		public Iterable<Room> getRooms(){
			return this.roomRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/guests")
	public class GuestController{
		@Autowired
		private GuestRepository guestRepository;

		@GetMapping
		public Iterable<Guest> getGuests(){
			return this.guestRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/reservations")
	public class ReservationController{
		@Autowired
		private ReservationRepository reservationRepository;

		@GetMapping
		public Iterable<Reservation> getReservations(){
			return this.reservationRepository.findAll();
		}
	}
	*/
}
