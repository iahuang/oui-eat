package com.ouieat.requests.handler;

import com.ouieat.implementation.handler.Implementation;
import com.ouieat.interactor.handler.Interactor;
import com.ouieat.interactor.user.UserInteractor;
import com.ouieat.responses.handler.Response;

public class UnauthenticatedRequest<
    T extends Interactor<?, ?>, J extends Implementation<T>
>
    extends Request<T, J> {

    public <K> Response handle(
        T interactor,
        K data,
        FunctionalInterfaces.Function2<T, K, Response> function
    ) {
        return function.apply(interactor, data);
    }

    public <K, L> Response handle(
        T interactor,
        K data1,
        L data2,
        FunctionalInterfaces.Function3<T, K, L, Response> function
    ) {
        return function.apply(interactor, data1, data2);
    }

    public UnauthenticatedRequest(
        UserInteractor userInteractor,
        T interactor,
        J implementation
    ) {
        super(userInteractor, interactor, implementation);
    }
}
