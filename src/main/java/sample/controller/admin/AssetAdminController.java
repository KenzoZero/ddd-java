package sample.controller.admin;

import java.util.List;

import javax.validation.Valid;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sample.model.asset.*;
import sample.model.asset.CashInOut.FindCashInOut;
import sample.usecase.AssetAdminService;

/**
 * 資産に関わる社内のUI要求を処理します。
 *
 * @author jkazama
 */
@RestController
@RequestMapping("/admin/asset")
@Setter
public class AssetAdminController {

    @Autowired
    private AssetAdminService service;

    /** 未処理の振込依頼情報を検索します。 */
    @GetMapping("/cio")
    public List<CashInOut> findCashInOut(@Valid FindCashInOut p) {
        return service.findCashInOut(p);
    }

}
