package pl.yellowribbon.core.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.yellowribbon.core.dto.AppointmentResponse;
import pl.yellowribbon.core.dto.CustomerResponse;
import pl.yellowribbon.core.dto.UserResponse;
import pl.yellowribbon.core.entities.AppointmentEntity;
import pl.yellowribbon.core.entities.CustomerEntity;
import pl.yellowribbon.core.entities.UserEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface AppointmentMapper {

    AppointmentResponse toResponse(AppointmentEntity appointment);

    UserResponse toUserResponse(UserEntity user);

    CustomerResponse toCustomerResponse(CustomerEntity customer);
}
