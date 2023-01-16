package guru.sfg.beer.order.service.domain;

public enum BeerOrderEventEnum {
    VALIDATE_ORDER,
    VALIDATION_PASSED,
    VALIDATION_FAILED,
    ALLOCATE_ORDER,
    ALLOCATION_SUCCESS,
    ALLOCATION_FAILED,
    BEERORDER_PICKED_UP
}
