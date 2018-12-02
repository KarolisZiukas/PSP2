import com.example.psp2.service.employeesService.BaseFacadeEmployeesService
import com.example.psp2.service.employeesService.DesignersService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfigA {

    @Bean
    fun designerService(): BaseFacadeEmployeesService {
        return DesignersService()
    }
}