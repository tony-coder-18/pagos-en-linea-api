package com.example.demo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TransactionController {

@Autowired
TransactionRepository transactionRepository;

@PostMapping("/addTransaction")
public Transaction addtransaction(@RequestBody Transaction transaction)
{
return transactionRepository.save(transaction);
}

@PutMapping("/updateTransaction/{id}")
public Transaction updateTransaction(@PathVariable(value="id") Long id, @RequestBody Transaction transactionDetails)
{
Optional<Transaction> transaction = transactionRepository.findById(id);
Transaction transaction_new=transaction.get();
transaction_new.setClient_identification(transactionDetails.getClient_identification());
transaction_new.setClient_direction(transactionDetails.getClient_direction());
transaction_new.setProducts_value(transactionDetails.getProducts_value());
return transactionRepository.save(transaction_new);

}

@DeleteMapping("/deleteTransaction/{id}")
public void deleteTransaction(@PathVariable(value="id") Long id)
{
Optional<Transaction> transaction=transactionRepository.findById(id);
Transaction transaction_new=transaction.get();
transactionRepository.delete(transaction_new);
}
}
