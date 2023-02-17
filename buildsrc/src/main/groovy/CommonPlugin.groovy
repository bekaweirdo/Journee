import org.gradle.api.Plugin
import org.gradle.api.Project

class CommonPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.apply([from: "$target.rootDir/buildSrc/commons.gradle"])
    }

}
