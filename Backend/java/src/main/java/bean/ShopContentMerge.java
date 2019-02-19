package bean;

import com.dxc.openShopReport.model.Content;
import com.dxc.openShopReport.model.Hardwarecontent;

import java.util.List;

public class ShopContentMerge {
    private List<Content> shopData;
    private HardwareContentTemp hardwareData;

    public List<Content> getShopData() {
        return shopData;
    }

    public void setShopData(List<Content> shopData) {
        this.shopData = shopData;
    }

    public HardwareContentTemp getHardwareData() {
        return hardwareData;
    }

    public void setHardwareData(HardwareContentTemp hardwareData) {
        this.hardwareData = hardwareData;
    }

    public ShopContentMerge(List<Content> shopData, HardwareContentTemp hardwareData) {
        this.shopData = shopData;
        this.hardwareData = hardwareData;
    }
}
