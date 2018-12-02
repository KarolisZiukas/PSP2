import com.example.psp2.service.employeesService.BaseFacadeEmployeesService
import com.example.psp2.service.employeesService.ManagersService
import org.springframework.context.annotation.Bean

//@Configuration
class AppConfigB {

    @Bean
    fun managerService(): BaseFacadeEmployeesService {
        return ManagersService()
    }
}