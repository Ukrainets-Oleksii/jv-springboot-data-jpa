package mate.academy.springboot.service.mapper;

public interface ResponseDtoMapper<T, D> {
    D toDto(T t);
}
