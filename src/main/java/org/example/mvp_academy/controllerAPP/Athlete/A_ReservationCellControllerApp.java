package org.example.mvp_academy.controllerAPP.Athlete;

import org.example.mvp_academy.Bean.ReservationBean;
import org.example.mvp_academy.Bean.UserBean;
import org.example.mvp_academy.Dao.ReservationDao;
import org.example.mvp_academy.Model.Reservation;
import org.example.mvp_academy.other.Singleton;

public class A_ReservationCellControllerApp {

    public String ret_date_reservation(ReservationBean reservation) {
        return reservation.getDate();
    }


    public String ret_hour_reservation(ReservationBean reservation) {
        return reservation.getHour();
    }

    public String ret_trainerName_reservation(ReservationBean reservation) {
        return reservation.getTrainer();
    }

    public void remove(ReservationBean reservationbean) throws Exception {
        ReservationDao reservationDao = new ReservationDao();
        Reservation reservation= reservationbean.getReservation();
        reservationDao.remove(reservation);
        Singleton.getLoginInstance().removeReservation(reservationbean);
    }

    public String ret_state_reservation(ReservationBean reservation) throws Exception {
        return reservation.getState();
    }
}
