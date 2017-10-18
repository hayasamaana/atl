package Test.haya.files;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import families.FamiliesPackage;
import families.impl.FamilyImpl;
import shapelangauge.RootBlock;
import shapelangauge.ShapelangaugeFactory;
import shapelangauge.impl.RootBlockImpl;
import shapelangauge.impl.ShapelangaugeFactoryImpl;
import shapelangauge.impl.ShapelangaugePackageImpl;

public class testtttttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FamiliesPackage.eINSTANCE.eClass();
		ShapelangaugeFactory factory=ShapelangaugeFactoryImpl.eINSTANCE;
		
		RootBlock rootblock=factory.createRootBlock();
		rootblock.setName("hayooooy");
		// As of here we preparing to save the model content

        // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI("Model/Family.xmi"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
       FamilyImpl my= (FamilyImpl) resource.getContents().get(0);
       System.out.print(my.getLastName());
        return ;
        
	}

}
