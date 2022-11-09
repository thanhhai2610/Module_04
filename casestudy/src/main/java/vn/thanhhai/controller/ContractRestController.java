package vn.thanhhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.service.contract.IContractDetailService;
import vn.thanhhai.service.contract.IContractService;

import java.util.List;

@RestController
@RequestMapping("/api/contract-detail/v1")
public class ContractRestController {

    @Autowired
    private IContractDetailService contractDetailService;

    @GetMapping("/{contractId}")
    public ResponseEntity<List<ContractDetail>> getListContractDetail(@PathVariable int contractId) {
        List<ContractDetail> contractDetailList = contractDetailService.myFindAllContractDetail(contractId);
        if (contractDetailList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contractDetailList, HttpStatus.OK);
    }
}
