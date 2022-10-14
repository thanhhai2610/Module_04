package convert_money.service.impl;

import convert_money.service.IServiceMoney;
import org.springframework.stereotype.Service;

@Service
public class ServiceMoney implements IServiceMoney {
    @Override
    public double convert_money(double money) {
        return money*23000;
    }
}
